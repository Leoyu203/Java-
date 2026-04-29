
let employees;
async function init(){
  
  let link = "https://Lesson48ClassworkDBServer.ernestoporchett.repl.co";
  let route= "/employees"
  info = await fetch(link+route);
  employees = await info.json();

  let output = ""
  let build ="";

   

  


}