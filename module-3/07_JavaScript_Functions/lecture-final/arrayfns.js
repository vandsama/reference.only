
const arr = [1, 2, 3, 4];

console.log(arr.map(v => v * 2));
arr.forEach(v => {
    console.log(v);
})

for (const v of arr) {
    console.log(v);
}

console.log(arr.filter(v => v % 2 === 0));
console.log(arr.find(v => v % 2 === 0));
console.log(arr.findIndex(v => v % 2 === 0));

console.log(arr.join("|"));

const sum = arr.reduce((acc, v) => acc += v);
console.log(sum);

const wordArray = ['fe', 'fi', 'fo', 'fum'];
const r = wordArray.reduce((cnt, word) => cnt += word.length, 0);
console.log(r);

let nameParts = ['bosco', 'p.', 'soultrain'];

// 'acc' is the accumulator 
let fullName = nameParts.reduce((acc, part) => {
    console.log(acc);
    return acc + ' ' + part.substring(0, 1).toLocaleUpperCase() + part.substring(1);
}, ''); // <--- The empty quotes is the value of the reducer for the first element

console.log(fullName);
