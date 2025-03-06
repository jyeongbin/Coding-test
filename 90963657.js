const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const n = parseInt(line.trim());
  
  // 코드1의 수행 횟수 계산
  // 이는 조합 nC2 = n(n-1)/2와 같음
  const executionCount = (n * (n - 1)) / 2;
  console.log(executionCount);
  
  // 수행 횟수를 다항식으로 표현하면 n(n-1)/2 = n²/2 - n/2
  // 따라서 최고차항의 차수는 2
  console.log(2);
  
  rl.close();
});