from flask import Flask  # استيراد Flask لإنشاء التطبيق

app = Flask(__name__)  # إنشاء كائن من Flask يسمى app

@app.route('/')  # تحديد المسار "/" وربطه بالدالة التالية
def hello_world():
    return 'Hello World!'  # عرض النص "Hello World!" عند زيارة الصفحة

if __name__ == "__main__":  # التأكد أن الملف يتم تشغيله مباشرة
    app.run(debug=True)  # تشغيل التطبيق في وضع التصحيح
