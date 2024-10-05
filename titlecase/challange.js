
function titleCase(str){
   let arr= str.split(' ');
    for(let i=0;i<arr.length;i++){
        let newvar=arr[i].split("");
        newvar[0]=newvar[0].toUpperCase();
       arr[i] = newvar.join("");
    }
    return arr.join(" ");
}
  console.log(titleCase("ali is a good boy"))
