# Ứng Dụng Đăng Ký Khám Sức Khỏe

## 📱 Mô tả

Một ứng dụng Android mô phỏng hệ thống đăng ký khám sức khỏe tại bệnh viện. Ứng dụng cho phép người dùng nhập thông tin cá nhân, chọn giới tính với avatar tương ứng, và đăng ký các dịch vụ y tế với tính năng tính phí tự động.

## ✨ Tính năng chính

- **Quản lý thông tin cá nhân**: Họ tên, ngày sinh, số điện thoại
- **Chọn giới tính với avatar**: Nam, Nữ, Khác với hình ảnh minh họa
- **Đăng ký dịch vụ y tế**: Khám sức khỏe, xét nghiệm máu, chụp X-quang
- **Tính phí tự động**: Tự động tính toán chi phí dựa trên dịch vụ đã chọn
- **Xác thực dữ liệu**: Kiểm tra tính hợp lệ của thông tin nhập vào
- **Dialog xác nhận**: Hiển thị thông tin tổng hợp và xác nhận

## 🛠️ Công nghệ sử dụng

- **Ngôn ngữ**: Java
- **Framework**: Android SDK
- **UI Components**:
  - EditText (nhập thông tin cá nhân)
  - RadioButton & RadioGroup (chọn giới tính)
  - CheckBox (chọn dịch vụ)
  - ImageView (hiển thị avatar)
  - TextView (hiển thị kết quả)
  - Button (xác nhận và thoát)
  - Toast (thông báo)
  - AlertDialog (xác nhận)

## 📱 Giao diện

- **Thông tin cá nhân**: Họ tên, ngày sinh, số điện thoại
- **Chọn giới tính**: Radio buttons với 3 lựa chọn
- **Avatar động**: Thay đổi theo giới tính được chọn
- **Dịch vụ y tế**: Checkbox cho từng dịch vụ
- **Hiển thị chi phí**: Tổng tiền tự động cập nhật
- **Nút xác nhận**: Xử lý đăng ký
- **Nút thoát**: Đóng ứng dụng

## 🚀 Cách sử dụng

1. Mở ứng dụng
2. Nhập thông tin cá nhân (họ tên, ngày sinh, SĐT)
3. Chọn giới tính (avatar sẽ thay đổi tương ứng)
4. Chọn các dịch vụ y tế cần đăng ký
5. Xem chi phí tự động cập nhật
6. Nhấn "Xác nhận" để hoàn tất đăng ký
7. Xem thông tin tổng hợp trong dialog

## 💰 Bảng giá dịch vụ

- **Khám sức khỏe**: Miễn phí hoặc có phí (tùy cài đặt)
- **Xét nghiệm máu**: Có phí
- **Chụp X-quang**: Có phí
- **Tổng chi phí**: Tự động tính toán

## ⚠️ Xử lý lỗi

- Kiểm tra thông tin bắt buộc (họ tên, ngày sinh, SĐT)
- Yêu cầu chọn ít nhất một giới tính
- Yêu cầu chọn ít nhất một dịch vụ
- Thông báo lỗi bằng Toast khi thiếu thông tin

## 📋 Yêu cầu hệ thống

- Android 7.0 (API level 24) trở lên
- Android Studio Flamingo hoặc mới hơn
- Java 8+

## 🔧 Cài đặt và chạy

1. Clone repository này
2. Mở project trong Android Studio
3. Sync Gradle files
4. Chạy ứng dụng trên device hoặc emulator

## 📁 Cấu trúc tài nguyên

- **Drawable**: 
  - `male.png` - Avatar nam
  - `female.png` - Avatar nữ  
  - `other.png` - Avatar khác
- **Layout**: `activity_main.xml`
- **Values**: strings, colors, themes

## 📝 Ghi chú

- Package name: `com.example.app3`
- Theme: `Theme.App3`
- Minimum SDK: 24
- Target SDK: 34
- Sử dụng EdgeToEdge display

## 👨‍💻 Tác giả

Lưu Lâm Công - Phát triển trong khóa học lập trình Android

---
*Ứng dụng được phát triển cho mục đích học tập và thực hành lập trình Android, mô phỏng hệ thống đăng ký y tế.*
