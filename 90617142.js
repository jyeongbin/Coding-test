const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const lines = [];

rl.on('line', (line) => {
    lines.push(line);
    
    // 입력의 끝(0 0 0)이 들어오면 처리 시작
    if (line === '0 0 0') {
        processLines();
        rl.close();
    }
});

function processLines() {
    // 마지막 줄(0 0 0)을 제외하고 처리
    for (let i = 0; i < lines.length - 1; i++) {
        const sides = lines[i].split(' ').map(Number);
        console.log(getTriangleType(sides));
    }
}

function getTriangleType(sides) {
    // 삼각형의 조건 검사: 가장 긴 변의 길이 < 나머지 두 변의 길이의 합
    sides.sort((a, b) => a - b); // 오름차순 정렬
    
    if (sides[0] + sides[1] <= sides[2]) {
        return "Invalid";
    }
    
    // 세 변의 길이에 따른 삼각형 유형 판별
    if (sides[0] === sides[1] && sides[1] === sides[2]) {
        return "Equilateral";
    } else if (sides[0] === sides[1] || sides[1] === sides[2] || sides[0] === sides[2]) {
        return "Isosceles";
    } else {
        return "Scalene";
    }
}