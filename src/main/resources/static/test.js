(()=> {
    // 서버에서 do 테이블의 do 목록을 불러온다
    fetchDo();
    // do 목록을 반복해서
    // id가 do 인 select 태그 안에다 option 태그를 만들어서 넣는다.
    // id가 do 인 select 태그에 change 이벤트를 건다.
        // change 됐을때마다 id가 sigungu인 태그 안을 비워준다.
        // 서버에서 선택된 do_number에 맞는 sigungu 목록을 불러와서
        // sigungu 목록을 반복해서
        // id가 sigungu인 태그 안에다 option 태그를 만들어서 넣는다.
})()


function fetchDo() {
    fetch('/do')
        .then(response => response.json())
        .then(doList => {
            // console.log(doList);
            const selectElement = document.getElementById('do'); // select 태그를 가리키는 요소를 가져옴

            for (const item of doList) { // do 목록을 반복

                const option = document.createElement('option'); // option 요소를 생성
                option.value = item.do_number; // option의 값에 do_number를 설정
                option.textContent = item.do_name; // option의 텍스트에 do_name을 설정
                selectElement.appendChild(option); // select 태그에 option 요소를 추가
            }

            // id가 do 인 select 태그에 change 이벤트를 건다.
            selectElement.addEventListener('change', () => {

                const selectedDo = selectElement.value; // 선택된 do_number 가져오기

                fetch(`/sigungu/${selectedDo}`) // 서버에 선택된 do_number에 대한 sigungu 목록 요청
                    .then(response => response.json())
                    .then(sigunguList => {
                        const sigunguSelect = document.getElementById('sigungu'); // sigungu select 요소 가져오기
                        sigunguSelect.innerHTML = ''; // sigungu select 요소 비우기
                        for (const sigungu of sigunguList) { // sigungu 목록을 반복
                            const option = document.createElement('option'); // option 요소 생성
                            option.value = sigungu.id; // option의 값에 sigungu의 id를 설정
                            option.textContent = sigungu.name; // option의 텍스트에 sigungu의 이름을 설정
                            sigunguSelect.appendChild(option); // sigungu select 태그에 option 요소 추가
                        }
                    });
            })
        });
}