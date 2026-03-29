# Wireframes - Hệ thống Quản lý Kho hàng

## Wireframe 1: Login & Register Page

```
┌─────────────────────────────────────────────────────────┐
│                    INVENTORY SYSTEM                      │
│                    Logo / Header                         │
└─────────────────────────────────────────────────────────┘
│                                                           │
│         ┌──────────────────────────────┐                 │
│         │   ĐĂNG NHẬP / ĐĂNG KÝ        │                 │
│         │                              │                 │
│         │  Email: ________________     │                 │
│         │  Password: ____________       │                 │
│         │                              │                 │
│         │  [ ĐĂNG NHẬP ]              │                 │
│         │                              │                 │
│         │  Chưa có tài khoản?          │                 │
│         │  [ ĐĂNG KÝ TẠI ĐÂY ]         │                 │
│         │                              │                 │
│         │  [Quên mật khẩu?]            │                 │
│         └──────────────────────────────┘                 │
│                                                           │
└─────────────────────────────────────────────────────────┘

REGISTER FORM:
┌─────────────────────────────────────────────────────────┐
│        ┌──────────────────────────────┐                 │
│        │      ĐĂNG KÝ TÀI KHOẢN       │                 │
│        │                              │                 │
│        │  Họ và tên: ___________      │                 │
│        │  Email: _______________      │                 │
│        │  Số điện thoại: ________     │                 │
│        │  Password: ____________      │                 │
│        │  Nhập lại PW: _________      │                 │
│        │  Role: [ User ]▼             │                 │
│        │                              │                 │
│        │  [ ĐĂNG KÝ ]   [ HỦY ]       │                 │
│        │                              │                 │
│        │  Đã có tài khoản?            │                 │
│        │  [ ĐĂNG NHẬP ]               │                 │
│        └──────────────────────────────┘                 │
└─────────────────────────────────────────────────────────┘
```

**Thành phần chính:**

- Header với logo/tên ứng dụng
- Form đăng nhập: Email, Password, nút Đăng nhập
- Link chuyển sang Đăng ký và Quên mật khẩu
- Form đăng ký: Tên, Email, SĐT, Password, Nhập lại, Role
- Validation messages khi nhập sai
- Loading state khi submit form

---

## Wireframe 2: Dashboard - Danh sách Sản phẩm

```
┌─────────────────────────────────────────────────────────────────────┐
│ ☰  LOGO           │  INVENTORY SYSTEM     │  👤 User  │ ⚙️  🚪 Logout│
├─────────────────────────────────────────────────────────────────────┤
│ Sidebar                                      Main Content            │
│                                                                      │
│ 📊 Dashboard                  ┌──────────────────────────────────┐  │
│                               │ Dashboard / Sản phẩm              │  │
│ 📦 Sản phẩm                   │                                  │  │
│    ├─ Danh sách                                                  │  │
│    └─ Thêm mới                │ Bộ lọc & Tìm kiếm:              │  │
│                               │ ┌────────────────────┐           │  │
│ 📂 Danh mục                   │ │🔍 Tìm kiếm...      │ [Filter]│  │
│    ├─ Danh sách                │ └────────────────────┘           │  │
│    └─ Thêm mới                │                                  │  │
│                               │ ┌──────────────────────────────┐ │  │
│ 👥 Nhà cung cấp               │ │ Product List                 │ │  │
│    ├─ Danh sách                │ ├──────────────────────────────┤ │  │
│    └─ Thêm mới                │                                  │ │  │
│                               │ STT│ SKU │Name  │Cat │Price│Qty│ │  │
│ 🔄 Giao dịch                  │─────────────────────────────────  │  │
│    ├─ Nhập kho                 │ 1 │P001│Laptop│IT │15M │50  │   │  │
│    ├─ Xuất kho                 │ 2 │P002│Phone │IT │5M  │100 │   │  │
│    └─ Danh sách                │ 3 │P003│Desk  │FUR│2M  │30  │   │  │
│                               │                                  │ │  │
│ 👨‍💼 Quản lý User               │ [Edit] [Delete] [View]           │ │  │
│    ├─ Danh sách                │                                  │ │  │
│    └─ Thêm mới                │ Pagination: < 1 2 3 ... >       │ │  │
│                               │ [Add New Product] Button         │ │  │
│ ⚙️  Cài đặt                    │ └──────────────────────────────┘ │  │
│                               │                                  │  │
└───────────────────────────────┴──────────────────────────────────┘
```

**Thành phần chính:**

- Top Navigation: Logo, Title, User Info, Logout
- Sidebar: Menu chính (Dashboard, Sản phẩm, Danh mục, NCC, Giao dịch, User, Cài đặt)
- Search/Filter Bar: Tìm kiếm sản phẩm, bộ lọc theo danh mục
- Table/Grid: Danh sách sản phẩm với cột (SKU, Name, Category, Price, Quantity)
- Action Buttons: Edit, Delete, View chi tiết cho mỗi hàng
- Add New Button: Button thêm sản phẩm mới
- Pagination: Phân trang danh sách

---

## Wireframe 3: Quản lý Sản phẩm (Add/Edit Form)

```
┌─────────────────────────────────────────────────────────────────────┐
│ ☰  LOGO           │  INVENTORY SYSTEM     │  👤 User  │ ⚙️  🚪 Logout│
├─────────────────────────────────────────────────────────────────────┤
│ Sidebar                                      Main Content            │
│                                                                      │
│ 📦 Sản phẩm                   ┌──────────────────────────────────┐  │
│    ├─ Danh sách √              │ Sản phẩm / Thêm Mới             │  │
│    └─ Thêm mới                 │ ◀ Quay lại                      │  │
│                               │                                  │  │
│                               │┌──────────────────────────────┐ │  │
│                               ││ THÔNG TIN CHUNG              │ │  │
│                               │├──────────────────────────────┤ │  │
│                               ││ Tên sản phẩm:                │ │  │
│                               ││ ________________________     │ │  │
│                               ││                              │ │  │
│                               ││ SKU:                         │ │  │
│                               ││ ________________________     │ │  │
│                               ││                              │ │  │
│                               ││ Danh mục:   [Select ▼]      │ │  │
│                               ││ Nhà cung cấp: [Select ▼]    │ │  │
│                               │└──────────────────────────────┘ │  │
│                               │                                  │  │
│                               │┌──────────────────────────────┐ │  │
│                               ││ GIỚI HẠNG & GIÁ             │ │  │
│                               │├──────────────────────────────┤ │  │
│                               ││ Giá bán:                     │ │  │
│                               ││ ________________________     │ │  │
│                               ││                              │ │  │
│                               ││ Giá vốn:                     │ │  │
│                               ││ ________________________     │ │  │
│                               ││                              │ │  │
│                               ││ Số lượng hiện tại:           │ │  │
│                               ││ ________________________     │ │  │
│                               │└──────────────────────────────┘ │  │
│                               │                                  │  │
│                               │┌──────────────────────────────┐ │  │
│                               ││ ẢNH SẢN PHẨM              │ │  │
│                               │├──────────────────────────────┤ │  │
│                               ││   [Image Placeholder]        │ │  │
│                               ││   ┌──────────────────┐       │ │  │
│                               ││   │  Click to upload │       │ │  │
│                               ││   └──────────────────┘       │ │  │
│                               ││   Supported: JPG, PNG        │ │  │
│                               ││   Max size: 5MB              │ │  │
│                               │└──────────────────────────────┘ │  │
│                               │                                  │  │
│                               │┌──────────────────────────────┐ │  │
│                               ││ MÔ TẢ                        │ │  │
│                               │├──────────────────────────────┤ │  │
│                               ││ ________________________     │ │  │
│                               ││ ________________________     │ │  │
│                               ││ ________________________     │ │  │
│                               │└──────────────────────────────┘ │  │
│                               │                                  │  │
│                               │ [ LƯU ]   [ HỦY ]   [ XÓA ]    │  │
│                               │                                  │  │
│                               └──────────────────────────────────┘  │
│                                                                      │
└─────────────────────────────────────────────────────────────────────┘
```

**Thành phần chính:**

- Header breadcrumb: "Sản phẩm > Thêm Mới" với nút quay lại
- Form Section 1: Thông tin chung
  - Tên sản phẩm (text input)
  - SKU (text input)
  - Danh mục (dropdown)
  - Nhà cung cấp (dropdown)
- Form Section 2: Giới hạng & Giá
  - Giá bán (number input)
  - Giá vốn (number input)
  - Số lượng hiện tại (number input)
- Form Section 3: Ảnh sản phẩm
  - Upload image area
  - Hỗ trợ JPG, PNG
  - Giới hạn dung lượng 5MB
- Form Section 4: Mô tả
  - Textarea cho mô tả chi tiết
- Action Buttons:
  - [Lưu] - Submit form
  - [Hủy] - Quay lại
  - [Xóa] - Chỉ hiển thị khi edit (không phải add mới)

---

## Component Layout Notes

### Color Scheme (Khuyến nghị)

- Primary Color: #2563eb (Blue) - Buttons, Links
- Secondary Color: #10b981 (Green) - Success, Add button
- Danger Color: #ef4444 (Red) - Delete button
- Background: #f9fafb (Light Gray)
- Text: #1f2937 (Dark Gray)

### Responsive Design

- Desktop: Full layout với sidebar
- Tablet: Sidebar có thể collapse
- Mobile: Hamburger menu, stack layout vertically

### Validation & Error Handling

- Red border + error message dưới input field
- Toast/Notification cho success/error messages
- Loading spinner khi submit
- Disabled button khi validate fail

### User Permissions

- ADMIN: Xem tất cả, CRUD đầy đủ
- USER: Xem danh sách, cập nhật profile riêng
