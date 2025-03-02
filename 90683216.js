const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const n = parseInt(line.trim());
  
  // MenOfPassion 알고리즘 분석
  // 코드1의 수행 횟수는 항상 1번
  console.log(1);
  
  // 최고차항의 차수는 0 (상수 시간)
  // n에 상관없이 항상 한 번만 실행되므로 O(1)의 시간 복잡도를 가짐
  console.log(0);
  
  rl.close();
});