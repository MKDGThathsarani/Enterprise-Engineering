function loadCustomerInformation() {
    fetch("http://localhost:8080/customer")
        .then(res => res.json())
        .then(data => {
            console.log(data);
            populateCustomerList(data)
            
        })
}

function populateCustomerList(data){
    let tbodyelement = document.getelementById("tbody-customer-view");

    let content =  `<tr><td>`

    data.array.forEach(element => {
        
    });
}

loadCustomerInformation();