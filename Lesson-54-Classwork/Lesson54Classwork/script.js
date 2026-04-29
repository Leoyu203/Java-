let data, customers;
async function init(){
    link = "";
    route="";
    let info = await fetch(link + route);
    customers = await info.json();

}  