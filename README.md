# 📱 Attendease - Android Attendance Management App

**Attendease** is an Android-based attendance management app built using **Java**. It enables users to check in and check out based on their location using Google Maps-based geofencing. The app also provides attendance statistics, recent activity logs, and profile management features.

---

## 🔧 Tech Stack

- **Language**: Java
- **UI**: XML, Material Design
- **API Integration**: Retrofit
- **Location Services**: Google Maps API, Geofencing
- **Architecture**: MVVM (Model-View-ViewModel)
- **Local Storage**: SharedPreferences (for login state)

---

## ✨ Key Features

### ✅ Login Functionality
- Secure login using mock/token-based authentication
- Input validation with password visibility toggle

### 🗺️ Geo-fencing & Location
- Maps integration using Google Maps SDK
- Auto attendance marking when entering/exiting geo-fenced office area
- Permission handling for location access

### 📅 Attendance Management
- **Check-In / Check-Out** buttons
- Stores daily logs with timestamps
- Display recent logs with RecyclerView
- Icons differentiate between check-in and check-out activities

### 📊 Statistics Dashboard
- View attendance summary:
    - On-Time
    - Late
    - Early Leaves
    - Overtime
    - Leave
- Time filters: 7 days, 14 days, 30 days

### 👤 Profile & Leaves
- View profile information
- Navigate to leaves section (coming soon)

---

## 🚀 How to Run the App

1. Clone the repository  
   `git clone https://github.com/your-username/attendease.git`

2. Open the project in **Android Studio**

3. Sync Gradle and run the app on an emulator or Android device

4. Set up your API endpoint or use a mock API for login

---


## 🙋‍♂️ Author

**Ashish Gharti**  
📧 ashishgharti26@gmail.com
---

