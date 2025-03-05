const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const n = parseInt(line.trim());
  
  // 코드1의 수행 횟수 계산
  // for 루프가 1부터 n까지 반복하므로 정확히 n번 실행됨
  console.log(n);
  
  // 코드1의 수행 횟수를 다항식으로 나타내면 O(n)
  // 최고차항의 차수는 1
  console.log(1);
  
  rl.close();
});