const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 소수인지 판별하는 함수
function isPrime(num) {
    // 1은 소수가 아님
    if (num === 1) return false;
    
    // 2는 소수
    if (num === 2) return true;
    
    // 2부터 제곱근까지만 확인하면 됨
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

let N = 0;
let count = 0;
let inputCount = 0;

rl.on('line', function(line) {
    if (count === 0) {
        // 첫 번째 줄: N 입력
        N = parseInt(line);
        count++;
    } else {
        // 두 번째 줄: N개의 수 입력
        const numbers = line.split(' ').map(Number);
        // 소수의 개수 계산
        const primeCount = numbers.filter(num => isPrime(num)).length;
        console.log(primeCount);
        rl.close();
    }
});