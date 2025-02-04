const fs = require('fs');

// 입력 받기 (백준 온라인 저지 방식)
const input = fs.readFileSync('/dev/stdin', 'utf8').trim().split(' ');
const N = parseInt(input[0]);
const B = parseInt(input[1]);

// 진법 변환 함수
function convertToBaseB(number, base) {
    // 빈 배열로 시작
    const digits = [];
    
    // 0인 경우 특별 처리
    if (number === 0) return '0';
    
    // 진법 변환 로직
    while (number > 0) {
        const remainder = number % base;
        
        // 10 이상인 경우 A-Z로 변환
        if (remainder < 10) {
            digits.unshift(remainder);
        } else {
            // A는 10, B는 11 ... Z는 35에 대응
            digits.unshift(String.fromCharCode(remainder - 10 + 65));
        }
        
        // 다음 자리수로 이동
        number = Math.floor(number / base);
    }
    
    // 배열을 문자열로 변환
    return digits.join('');
}

// 결과 출력
console.log(convertToBaseB(N, B));