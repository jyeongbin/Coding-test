const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 소인수분해 함수
function primeFactorization(n) {
    // 1인 경우 아무것도 출력하지 않음
    if (n === 1) return;
    
    let num = n;
    let divisor = 2;
    
    while (num > 1) {
        // 현재 divisor로 나눌 수 있으면 계속 나누기
        while (num % divisor === 0) {
            console.log(divisor);
            num = num / divisor;
        }
        // 나눌 수 없으면 다음 divisor로
        divisor++;
        
        // 최적화: num의 제곱근보다 큰 divisor는 검사할 필요 없음
        // 단, 남은 num이 소수인 경우는 예외
        if (divisor * divisor > num && num > 1) {
            console.log(num);
            break;
        }
    }
}

rl.on('line', (line) => {
    const N = parseInt(line);
    primeFactorization(N);
    rl.close();
});