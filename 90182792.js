const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

// 소수 판별 함수
function isPrime(num) {
    if (num < 2) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

rl.on('line', (line) => {
    input.push(parseInt(line));
}).on('close', () => {
    const M = input[0];
    const N = input[1];
    
    let primes = [];
    
    // M부터 N까지의 숫자 중 소수 찾기
    for (let i = M; i <= N; i++) {
        if (isPrime(i)) {
            primes.push(i);
        }
    }
    
    // 결과 출력
    if (primes.length === 0) {
        console.log(-1);
    } else {
        const sum = primes.reduce((acc, curr) => acc + curr, 0);
        const min = Math.min(...primes);
        console.log(sum);
        console.log(min);
    }
    
    process.exit();
});