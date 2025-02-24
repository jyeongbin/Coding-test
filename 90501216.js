const readline = require('readline');

const rl = readline.createInterface({
   input: process.stdin,
   output: process.stdout
});

let input = [];

rl.on('line', (line) => {
   input.push(line.split(' ').map(Number));
}).on('close', () => {
   const [x1, y1] = input[0];
   const [x2, y2] = input[1]; 
   const [x3, y3] = input[2];
   
   // 네 번째 점의 x좌표 찾기
   let x4;
   if (x1 === x2) x4 = x3;
   else if (x1 === x3) x4 = x2;
   else x4 = x1;
   
   // 네 번째 점의 y좌표 찾기
   let y4;
   if (y1 === y2) y4 = y3;
   else if (y1 === y3) y4 = y2;
   else y4 = y1;
   
   console.log(x4, y4);
   
   process.exit();
});