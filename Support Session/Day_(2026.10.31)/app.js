document.getElementById('loadBtn').addEventListener('click', function() {
    // Loading text එක පෙන්නන්න
    document.getElementById('loading').style.display = 'block';
    document.getElementById('customerTable').style.display = 'none';

    // ඔබේ Spring Boot Backend එකේ URL එක
    fetch("http://localhost:8080/customer/get-all")
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(data => {
            // වැඩේ හරි ගියාම
            document.getElementById('loading').style.display = 'none';
            document.getElementById('customerTable').style.display = 'table';
            
            const tableBody = document.getElementById('tableBody');
            tableBody.innerHTML = ''; // පරණ data තියෙනවා නම් අයින් කරන්න

            // ආපු data array එකේ හැම customer කෙනෙක්වම table එකට දාන්න
            data.forEach(customer => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.address}</td>
                    <td>${customer.age}</td>
                    <td>${customer.contactNumber}</td>
                `;
                tableBody.appendChild(row);
            });
        })
        .catch(error => {
            // Error එකක් ආවොත්
            document.getElementById('loading').style.display = 'none';
            console.error('Error fetching data:', error);
            alert("Error: Backend එක run වෙලා තියෙනවද කියලා බලන්න!");
        });
});