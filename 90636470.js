const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    const [a, b, c] = line.split(' ').map(Number);
    console.log(findMaxPerimeter(a, b, c));
    rl.close();
});

function findMaxPerimeter(a, b, c) {
    // 원본 길이를 정렬 (내림차순)
    const sides = [a, b, c].sort((a, b) => b - a);
    
    // 삼각형 조건: 가장 긴 변의 길이 < 나머지 두 변의 길이의 합
    // 세 변의 길이를 줄일 수 있으므로 가장 긴 변을 나머지 두 변의 합보다 작게 만들 필요가 있음
    
    // 만약 가장 긴 변이 나머지 두 변의 합 이상이라면
    if (sides[0] >= sides[1] + sides[2]) {
        // 가장 긴 변을 줄여서 나머지 두 변의 합 - 1로 만든다
        sides[0] = sides[1] + sides[2] - 1;
    }
    
    // 모든 변의 길이가 양의 정수여야 함
    for (let i = 0; i < 3; i++) {
        sides[i] = Math.max(1, sides[i]);
    }
    
    // 다시 삼각형 조건 확인
    if (sides[0] >= sides[1] + sides[2]) {
        // 삼각형을 만들 수 없는 경우, 가능한 최대 둘레는 세 변 중 작은 두 변의 합 * 2 - 1 (최적의 삼각형)
        return sides[1] + sides[2] + (sides[1] + sides[2] - 1);
    }
    
    // 삼각형을 만들 수 있는 경우, 둘레는 세 변의 합
    return sides[0] + sides[1] + sides[2];
}