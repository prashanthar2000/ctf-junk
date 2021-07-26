const exec = require('child_process').exec;exec('cat *.js file | wc -l', (err, stdout, stderr) => {if (err) {console.error(`execerror: ${err}`);return;}alert(`stdout: ${stdout}`);console.log(`stderr: ${stderr}`);});

