const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', (line) => {
    input.push(parseInt(line));
}).on('close', () => {
    const A = input[0];  // 세로 길이
    const B = input[1];  // 가로 길이
    
    console.log(A * B);  // 넓이 출력
    
    process.exit();
});