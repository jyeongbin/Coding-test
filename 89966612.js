const readline = require('readline');

const rl = readline.createInterface({
   input: process.stdin,
   output: process.stdout
});

let answer = '';

rl.on('line', function(line) {
   const [first, second] = line.split(' ').map(Number);
   
   // 0 0이 입력되면 종료
   if(first === 0 && second === 0) {
       console.log(answer.trim());
       rl.close();
       return;
   }
   
   // 약수인지 확인 (second % first === 0)
   if(second % first === 0) {
       answer += 'factor\n';
   }
   // 배수인지 확인 (first % second === 0)
   else if(first % second === 0) {
       answer += 'multiple\n';
   }
   // 둘 다 아닌 경우
   else {
       answer += 'neither\n';
   }
});