const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 약수들을 찾는 함수
function findDivisors(n) {
    const divisors = [];
    for (let i = 1; i < n; i++) {
        if (n % i === 0) {
            divisors.push(i);
        }
    }
    return divisors;
}

// 약수들의 합을 구하는 함수
function sumOfDivisors(divisors) {
    return divisors.reduce((sum, num) => sum + num, 0);
}

// 완전수 여부를 확인하고 결과를 출력하는 함수
function checkPerfectNumber(n) {
    if (n === -1) {
        rl.close();
        return;
    }

    const divisors = findDivisors(n);
    const sum = sumOfDivisors(divisors);

    if (sum === n) {
        // 완전수인 경우 약수들을 더하는 형태로 출력
        console.log(`${n} = ${divisors.join(' + ')}`);
    } else {
        // 완전수가 아닌 경우
        console.log(`${n} is NOT perfect.`);
    }
}

// 입력 받기
let inputs = [];
rl.on('line', function(line) {
    const num = parseInt(line);
    inputs.push(num);
    
    if (num === -1) {
        // 모든 입력에 대해 결과 출력
        inputs.forEach(n => {
            if (n !== -1) {
                checkPerfectNumber(n);
            }
        });
        rl.close();
    }
});