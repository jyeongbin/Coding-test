const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    const n = parseInt(line);
    
    // 한 변의 길이가 1인 정사각형이 n개 있을 때 둘레를 계산
    // n=1일 때 둘레는 4
    // n=3일 때 둘레는 12
    // 둘레 = 4*n (각 정사각형마다 4개의 변 중에서 외부에 노출된 변들의 합)
    const perimeter = 4 * n;
    
    console.log(perimeter);
    rl.close();
});