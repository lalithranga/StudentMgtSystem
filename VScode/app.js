


function btnAddStudent() {
    
    fetch("http://localhost:8080/students").then(res=> res.json()).then(data=> console.log(data)
    )
    console.log("lalith");


// let age =document.getElementById("lblage").value;
// let name=document.getElementById("lblname").value;
// let subject=document.getElementById("lblsubject").value;

// console.log(age,name,subject);



// const myHeaders = new Headers();
// myHeaders.append("Content-Type", "application/json");

// const raw = JSON.stringify({
//   "age": age,
//   "name": name,
//   "subject": subject
// });

// const requestOptions = {
//   method: "POST",
//   headers: myHeaders,
//   body: raw,
//   redirect: "follow"
// };

// fetch("http://localhost:8080/students", requestOptions)
//   .then((response) => response.text())
//   .then((result) => console.log(loadtable()))
//   .catch((error) => console.error(error));

  
}




//    function loadtable() {
   
//     fetch("http://localhost:8080/students").then(res=> res.json()).then(data=> console.log(data)
//     )

//    }