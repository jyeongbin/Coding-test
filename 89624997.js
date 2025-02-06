const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function(line) {
    const N = parseInt(line);
    console.log(calculatePoints(N));
    rl.close();
});

function calculatePoints(n) {
    // 한 변의 점의 개수는 2^N + 1
    // 전체 점의 개수는 (2^N + 1)^2
    return Math.pow((Math.pow(2, n) + 1), 2);
}