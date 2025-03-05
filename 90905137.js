const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const n = parseInt(line.trim());
  
  // 중첩 루프로 인해 코드1의 수행 횟수는 n * n = n²
  const executionCount = n * n;
  console.log(executionCount);
  
  // 시간 복잡도가 O(n²)이므로 최고차항의 차수는 2
  console.log(2);
  
  rl.close();
});