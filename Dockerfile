# Menggunakan Python sebagai base image
FROM python:3.9

# Mengatur direktori kerja di dalam kontainer
WORKDIR /app

# Menyalin file requirements.txt ke dalam kontainer
COPY requirements.txt .

# Menginstal dependensi Python yang diperlukan
RUN pip install --no-cache-dir -r requirements.txt 

#konfiguration port
EXPOSE 8080

# Install dependencies
RUN pip install flask scikit-learn matplotlib

# Install dependencies required for face_recognition
RUN pip install face_recognition

# Salin model.h5 ke dalam kontainer
COPY model.h5 .

# Menyalin seluruh kode sumber aplikasi ke dalam kontainer
COPY . .

# Menjalankan perintah saat kontainer dimulai
CMD ["python", "app.py"]
