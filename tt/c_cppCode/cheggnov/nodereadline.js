var readline = require('readline');
var rl = readline.createInterface(process.stdin, process.stdout);
rl.setPrompt('guess> ');
rl.prompt();
var line=''
rl.on('line', function(line) {
    if (line === "right") rl.close();
    rl.prompt();
}).on('close',function(){
   // process.exit(0);
});
console.log(line)