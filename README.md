________________________________________
 📚 Book REST API

A lightweight and flexible RESTful API built with **Jakarta EE (JAX-RS)** that provides access to a list of books in various formats — JSON, XML, HTML, and plain text.

---

🚀 Features

- ✅ Fetch all books using a simple `GET` endpoint
- 🔁 Supports content negotiation via `Accept` header
- 🧩 Modular service-oriented architecture
- 🖥 Deployable to any Jakarta EE-compliant application server

---

📦 Technologies

- Java 11+
- Jakarta EE (JAX-RS)
- JAXB (for XML output)
- Jackson or JSON-B (for JSON)
- Maven (optional for build management)

---

📂 Project Structure

src/
├── org.rest.app1/
│ └── BookRest.java # JAX-RS controller
├── org.services/
│ └── BookServices.java # Business logic
└── org.models/
└── Book.java # Book POJO

---

🔌 Sample Endpoint

➤ GET All Books

GET /api/books

🔧 Accept Headers Supported:

| Header                 | Response Format |
|------------------------|------------------|
| `application/json`     | JSON             |
| `application/xml`      | XML              |
| `text/html`            | HTML             |
| `text/plain`           | Plain Text       |

---

📥 Sample JSON Response

```json
[
  {
    "author": "George Orwell",
    "title": "1984",
    "isbn": "978-0451524935"
  },
  {
    "author": "J.K. Rowling",
    "title": "Harry Potter and the Sorcerer's Stone",
    "isbn": "978-0590353427"
  }
]
________________________________________
⚙️ How to Run
1. Clone the repository
git clone https://github.com/your-username/book-rest-api.git
cd book-rest-api
2. Import into your IDE (NetBeans, IntelliJ, etc.)
3. Deploy to a Jakarta EE server (e.g., Payara, WildFly)
4. Access the API
http://localhost:8080/api/books
Use tools like curl, Postman, or your browser.
________________________________________
🧪 Testing with curl
curl -H "Accept: application/json" http://localhost:8080/api/books
curl -H "Accept: text/html" http://localhost:8080/api/books
________________________________________
🤝 Contributing
Contributions, pull requests, and ideas are welcome!
1.	Fork this repository
2.	Create your feature branch: git checkout -b feature/your-feature
3.	Commit your changes: git commit -m "Add something"
4.	Push to the branch: git push origin feature/your-feature
5.	Open a Pull Request
________________________________________
📄 License
This project is licensed under the MIT License. See the LICENSE file for details.
________________________________________
💡 Author
PROF_MONEY
Software Engineer & Cybersecurity Expert
GitHub: @https://github.com/processor1

---
 

