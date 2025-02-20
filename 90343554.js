const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    // 입력값을 공백으로 구분하여 배열로 변환하고 정수로 파싱
    const [x, y, w, h] = line.split(' ').map(Number);
    
    // 각 경계선까지의 거리 중 최솟값 계산
    const minDistance = Math.min(
        x,          // 왼쪽 경계선까지의 거리
        y,          // 아래쪽 경계선까지의 거리
        w - x,      // 오른쪽 경계선까지의 거리
        h - y       // 위쪽 경계선까지의 거리
    );
    
    console.log(minDistance);
    rl.close();
});