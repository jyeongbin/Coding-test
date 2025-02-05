const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]); // 테스트 케이스 개수

for(let i = 1; i <= T; i++) {
   let cents = Number(input[i]);
   let result = calculateChange(cents);
   console.log(result.join(' '));
}

function calculateChange(cents) {
   const coins = [25, 10, 5, 1]; // 쿼터, 다임, 니켈, 페니
   let result = [];
   
   // 각 동전에 대해 필요한 개수 계산
   for(let coin of coins) {
       result.push(Math.floor(cents / coin)); // 해당 동전이 필요한 개수
       cents = cents % coin; // 남은 금액 계산
   }
   
   return result;
}