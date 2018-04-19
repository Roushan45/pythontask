var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
});

//defined the empty json object
var jsonObject={};
//asking user for json object description that what kinf of info
//going to store
//var description=prompt("Enter the description for json object")
//adding to json object
//jsonObject.description=description;
//using while for menu
while (1){
    console.log("1.Add info\n2.remove info\n3.get info\n4.display all\n5.Exit");
    //getting the user choice
  //  var choice = prompt("Please enter your selection");
  var choice='';
  rl.on('line', function(choice){
    console.log(choice);
})
    //adding the new property in json object
    if(choice==='1'){
        console.log("add property");
       // var key=prompt("Enter the key ");
        //var value=prompt("ENter the value ");
       // console.log("key = "+key)
        jsonObject[key]=value;
    }
    //getting the key for removing
    else if(choice==='2'){
        //var key=prompt("ENter the key for removing");
        //delete jsonObject[key];
    }
    //getting the value by providing the key
   else  if(choice==='3'){
  //  var key=prompt("ENter the key for get value");
   // console.log(jsonObject[key]);
    }
    //printing the json object
    else if(choice==='4'){
        console.log(JSON.stringify(jsonObject));
    }
    //exitting the menu
    else if(choice==='5'){
        break;
    }
    //in case of not valid input
    else{
        console.log("try again!");
    }
}