function main() {
    // console.log("Hello World!");
    let fs = require('fs');
    let inputName = fs.readFileSync().toString().split(' ');
    console.log(inputName + "??!")
}

main();