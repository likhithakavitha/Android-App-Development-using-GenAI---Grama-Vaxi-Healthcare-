# Android-App-Development-using-GenAI---Grama-Vaxi-Healthcare-
Grama-Vaxi is a "Livestock Health Alert" app. It tracks the vaccination cycle of every sheep/goat in the  village. It acts as a "Digital Health Card" and sends loud notifications 3 days before a government camp  reaches the village.
# 🐄 Grama-Vaxi – Livestock Healthcare Alert App

Grama-Vaxi is an Android healthcare application designed for rural farmers to track livestock vaccinations and receive vaccination camp alerts.

The app helps prevent animal deaths caused by missed vaccination schedules by providing digital health records and automated notifications.

---

# 📌 Problem Statement

In villages, livestock owners often miss government vaccination camp announcements because they are communicated only through local loudspeakers.

As a result:

- Sheep/goats become infected
- Disease outbreaks spread quickly
- Farmers face financial loss

Grama-Vaxi solves this problem through digital vaccination tracking and alert notifications.

---

# 🎯 Features

## ✅ Animal Registration

- Register livestock details
- Store:
  - Animal Name
  - Breed
  - Age
  - Vaccine Date

---

## ✅ Vaccination Reminder

- Sends alerts before vaccination camps
- Uses Android WorkManager
- Works even if the app is closed

---

## ✅ Offline Database

- Uses Room Database
- Stores animal medical records locally

---

## ✅ Backend API

- Built with:
  - Node.js
  - Express.js
  - MongoDB

---

## ✅ Future AI Features

- Disease prediction using GenAI
- Smart vaccination scheduling
- AI chatbot support for farmers

---

# 🛠️ Technologies Used

## Frontend

- Kotlin
- Android Studio
- XML UI
- Room Database
- WorkManager

## Backend

- Node.js
- Express.js
- MongoDB

## Tools

- Git
- GitHub

---

# 📂 Project Structure

```text
GramaVaxi/
│
├── android-app/
│   ├── MainActivity.kt
│   ├── Animal.kt
│   ├── AnimalDao.kt
│   ├── AppDatabase.kt
│   ├── NotificationWorker.kt
│   └── activity_main.xml
│
├── backend/
│   ├── package.json
│   └── server.js
│
└── README.md
```

---

# 🚀 Installation

## 1️⃣ Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/Grama-Vaxi.git
```

---

## 2️⃣ Backend Setup

```bash
cd backend
npm install
node server.js
```

Backend runs on:

```text
http://localhost:5000
```

---

## 3️⃣ Android Setup

1. Open Android Studio
2. Open `android-app`
3. Sync Gradle
4. Click ▶ Run

---

# 🌐 API Endpoints

## Add Animal

```http
POST /animals
```

### Request Body

```json
{
  "name": "Goat",
  "breed": "Boer",
  "age": 2,
  "vaccineDate": "2025-06-10"
}
```

---

## Get All Animals

```http
GET /animals
```

---

# 🔔 Notification Example

```text
Vaccination Camp Tomorrow!
Doctor arriving at Temple Square.
```

---

# 📱 Screens Included

- Animal Registration Screen
- Vaccination Reminder Alert
- Offline Data Storage

---

# 🌍 Impact Goals

- Prevent livestock deaths
- Improve rural animal healthcare
- Support farmers financially
- Digitize village animal health records

---

# 🔮 Future Enhancements

- Kannada Language Support
- Firebase Push Notifications
- QR Code for Animal ID
- AI Disease Detection
- Cloud Data Backup
- Government Vaccine API Integration

---

# 👨‍💻 Author

Project Name: Grama-Vaxi  
Category: Android App Development using GenAI  
Domain: Healthcare

---

# 📜 License

This project is developed for educational and healthcare innovation purposes.
