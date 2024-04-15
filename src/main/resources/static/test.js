(() => {

    fetchData();
})();


// 서버에서 데이터를 가져오는 함수
function fetchData() {
    // 서버에서 do 테이블의 do 목록을 불러온다
    fetch('/do')
        .then(response => response.json())
        .then(data => {
            const selectElement = document.getElementById('do'); // select 태그를 가리키는 요소를 가져옴

            // do 목록을 반복
            for (const item of data) {
                const option = document.createElement('option'); // option 요소를 생성
                option.value = item.doNumber; // option의 값에 do_number를 설정
                option.textContent = item.doName; // option의 텍스트에 do_name을 설정
                selectElement.appendChild(option); // select 태그에 option 요소를 추가
            }

            // id가 do 인 select 태그에 change 이벤트를 건다.
            selectElement.addEventListener('change', () => {
                const selectedDo = selectElement.value; // 선택된 do_number 가져오기

                // 선택된 do_number에 맞는 sigungu 목록 요청
                fetch(`/sigungu/${selectedDo}`)
                    .then(response => response.json())
                    .then(sigunguList => {
                        const sigunguSelect = document.getElementById('sigungu'); // sigungu select 요소 가져오기

                        sigunguSelect.innerHTML = ''; // sigungu select 요소 비우기

                        const defaultOption = document.createElement('option');
                        defaultOption.text = '시군구 선택';
                        sigunguSelect.add(defaultOption);

                        // sigungu 목록을 반복
                        for (const sigungu of sigunguList) {
                            const option = document.createElement('option'); // option 요소 생성
                            option.value = sigungu.sigunguNumber; // option의 값에 sigunguNumber를 설정
                            option.textContent = sigungu.sigunguName; // option의 텍스트에 sigunguName을 설정
                            sigunguSelect.appendChild(option); // sigungu select 태그에 option 요소 추가
                        }
                    });
            });
        });

    // id가 sigungu 인 select 태그에 change 이벤트를 건다.
    document.getElementById('sigungu').addEventListener('change', () => {

        const selectSigungu = document.getElementById('sigungu').value; // 선택된 sigunguNumber 가져오기

        // 서버에서 선택된 sigunguNumber에 맞는 eummyeondong 목록을 불러온다
        fetch(`/eummyeondong/${selectSigungu}`)
            .then(response => response.json())
            .then(eummyeondongList => {

                console.log(eummyeondongList);

                const eummyeondongSelect = document.getElementById('eummyeondong'); // eummyeondong select 요소 가져오기

                eummyeondongSelect.innerHTML = ''; // eummyeondong select 요소 비우기

                // eummyeondong 목록을 반복
                for (const eummyeondong of eummyeondongList) {
                    const option = document.createElement('option'); // option 요소 생성
                    option.value = eummyeondong.eummyeondongNumber; // option의 값에 eummyeondongNumber를 설정
                    option.textContent = eummyeondong.eummyeondongName; // option의 텍스트에 eummyeondongName을 설정
                    eummyeondongSelect.appendChild(option); // eummyeondong select 태그에 option 요소 추가
                }
            });
    });

    document.getElementById('eummyeondong').addEventListener('change', () => {

        const selectEummyeondong = document.getElementById('eummyeondong').value;

        // 서버에서 선택된 sigunguNumber에 맞는 eummyeondong 목록을 불러온다
        fetch(`/ri/${selectEummyeondong}`)
            .then(response => response.json())
            .then(riList => {

                console.log(riList);

                const riSelect = document.getElementById('ri');

                riSelect.innerHTML = '';

                // eummyeondong 목록을 반복
                for (const ri of riList) {
                    const option = document.createElement('option');
                    option.value = ri.riNumber;
                    option.textContent = ri.riName;
                    riSelect.appendChild(option);
                }
            });
    });
}
