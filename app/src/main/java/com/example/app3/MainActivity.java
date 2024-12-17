package com.example.app3;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imgAvatar;
    RadioButton radNam, radNu, radKhac;
    RadioGroup radGroupGT;
    EditText edtHoTen, edtNgaySinh, edtSDT;
    CheckBox cbxKhamSK, cbxXNMau, cbxChupXQ;
    TextView tvThanhTien, tvKQ;
    Button btnXacNhan, btnThoat;
    int thanhTien = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgAvatar = findViewById(R.id.imgAvatar);
        radNam = findViewById(R.id.radNam);
        radNu = findViewById(R.id.radNu);
        radKhac = findViewById(R.id.radKhac);
        radGroupGT = findViewById(R.id.radGroupGT);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSDT = findViewById(R.id.edtSDT);
        cbxKhamSK = findViewById(R.id.cbxKhamSK);
        cbxXNMau = findViewById(R.id.cbxXNMau);
        cbxChupXQ = findViewById(R.id.cbxChupXQ);
        tvThanhTien = findViewById(R.id.tvThanhTien);
        tvKQ = findViewById(R.id.tvKQ);
        btnXacNhan = findViewById(R.id.btnXacNhan);
        btnThoat = findViewById(R.id.btnThoat);
        radGroupGT.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radNam) {
                imgAvatar.setImageResource(R.drawable.male);
                Toast.makeText(MainActivity.this, "Giới tính Nam", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.radNu) {
                imgAvatar.setImageResource(R.drawable.female);
                Toast.makeText(MainActivity.this, "Giới tính Nữ", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.radKhac) {
                imgAvatar.setImageResource(R.drawable.other);
                Toast.makeText(MainActivity.this, "Giới tính Khác", Toast.LENGTH_SHORT).show();
            }
        });

        btnXacNhan.setOnClickListener(v -> {
            if (radNam.isChecked() || radNu.isChecked() || radKhac.isChecked()) {
                if (!edtHoTen.getText().toString().trim().isEmpty() &&
                        !edtNgaySinh.getText().toString().trim().isEmpty() &&
                        !edtSDT.getText().toString().trim().isEmpty()) {

                    if (cbxKhamSK.isChecked() || cbxXNMau.isChecked() || cbxChupXQ.isChecked()) {
                        String kq = "", gt = "", hoTen = "", ngaySinh = "", sdt = "", dichVu = "Dịch vụ: ";

                        if (radNam.isChecked()) {
                            gt = "Nam";
                        } else if (radNu.isChecked()) {
                            gt = "Nữ";
                        } else if (radKhac.isChecked()) {
                            gt = "Khác";
                        }

                        hoTen = edtHoTen.getText().toString().trim();
                        ngaySinh = edtNgaySinh.getText().toString().trim();
                        sdt = edtSDT.getText().toString().trim();

                        if (cbxKhamSK.isChecked()) {
                            dichVu += "\n\t" + cbxKhamSK.getText().toString();
                        }
                        if (cbxXNMau.isChecked()) {
                            dichVu += "\n\t" + cbxXNMau.getText().toString();
                        }
                        if (cbxChupXQ.isChecked()) {
                            dichVu += "\n\t" + cbxChupXQ.getText().toString();
                        }

                        kq = "Giới tính: " + gt + "\n";
                        kq += "Họ tên: " + hoTen + "\n";
                        kq += "Ngày sinh: " + ngaySinh + "\n";
                        kq += "Số điện thoại: " + sdt + "\n";
                        kq += dichVu + "\n";
                        kq += "Thành tiền: " + thanhTien;
                        tvKQ.setText(kq);
                    } else {
                        Toast.makeText(MainActivity.this, "Vui lòng chọn dịch vụ", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng điền Họ tên, Ngày sinh, Số điện thoại", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Vui lòng chọn giới tính", Toast.LENGTH_SHORT).show();
            }
        });

        cbxKhamSK.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                thanhTien += 200000;
            } else {
                thanhTien -= 200000;
            }
            tvThanhTien.setText(String.valueOf(thanhTien));
        });

        cbxXNMau.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                thanhTien += 350000;
            } else {
                thanhTien -= 350000;
            }
            tvThanhTien.setText(String.valueOf(thanhTien));
        });

        cbxChupXQ.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                thanhTien += 1000000;
            } else {
                thanhTien -= 1000000;
            }
            tvThanhTien.setText(String.valueOf(thanhTien));
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogThoat = new AlertDialog.Builder(MainActivity.this);
                dialogThoat.setTitle("Thoát ứng dụng");
                dialogThoat.setMessage("Bạn có chắc chắn muốn thoát không?");
                dialogThoat.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialogThoat.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogThoat.create().show();
            }
        });
    }
}
