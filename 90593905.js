const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let N;
let points = [];
let lineCount = 0;

rl.on('line', (line) => {
    if (lineCount === 0) {
        // 첫 번째 줄: 점의 개수
        N = parseInt(line);
    } else {
        // 이후 줄: 각 점의 좌표
        const [x, y] = line.split(' ').map(Number);
        points.push({ x, y });
    }
    
    lineCount++;
    
    // 모든 점을 입력받았으면 계산 시작
    if (lineCount === N + 1) {
        calculateArea();
        rl.close();
    }
});

function calculateArea() {
    // 점이 하나인 경우 넓이는 0
    if (N === 1) {
        console.log(0);
        return;
    }
    
    // 모든 점 중 최소/최대 x,y 좌표 찾기
    let minX = points[0].x;
    let maxX = points[0].x;
    let minY = points[0].y;
    let maxY = points[0].y;
    
    for (let i = 1; i < N; i++) {
        minX = Math.min(minX, points[i].x);
        maxX = Math.max(maxX, points[i].x);
        minY = Math.min(minY, points[i].y);
        maxY = Math.max(maxY, points[i].y);
    }
    
    // 넓이 계산: 가로 길이 × 세로 길이
    const width = maxX - minX;
    const height = maxY - minY;
    const area = width * height;
    
    console.log(area);
}