const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function(line) {
    const [N, K] = line.split(' ').map(Number);
    
    // 약수를 저장할 배열
    const divisors = [];
    
    // N의 약수 찾기
    for (let i = 1; i <= N; i++) {
        if (N % i === 0) {
            divisors.push(i);
        }
    }
    
    // K번째 약수 출력 (없으면 0 출력)
    console.log(divisors[K - 1] || 0);
    
    rl.close();
});