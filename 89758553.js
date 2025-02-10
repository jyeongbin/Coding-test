const readline = require('readline');

const rl = readline.createInterface({
   input: process.stdin,
   output: process.stdout
});

rl.on('line', function(line) {
   const X = parseInt(line);
   console.log(findFraction(X));
   rl.close();
});

function findFraction(X) {
   let line = 1;  // 현재 대각선 라인
   let sum = 0;   // 이전 대각선까지의 원소 개수 합
   
   // X가 속한 대각선 라인 찾기
   while (sum + line < X) {
       sum += line;
       line++;
   }
   
   // 해당 라인에서의 위치
   let position = X - sum;
   
   // 대각선이 짝수 라인인 경우 (위에서 아래로)
   if (line % 2 === 0) {
       let numerator = position;            // 분자
       let denominator = line - position + 1; // 분모
       return `${numerator}/${denominator}`;
   } 
   // 대각선이 홀수 라인인 경우 (아래에서 위로)
   else {
       let numerator = line - position + 1;   // 분자
       let denominator = position;            // 분모
       return `${numerator}/${denominator}`;
   }
}