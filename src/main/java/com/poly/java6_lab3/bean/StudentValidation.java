package com.poly.java6_lab3.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentValidation {
    @NotBlank(message = "Không được để trống email")
    @Email(message = "Không đúng định dạng email")
    String email;
    @NotBlank(message = "Không được để trống họ và tên")
    String fullname;
    @NotNull(message = "Không được để trống điểm")
    @PositiveOrZero(message = "Điểm phải lớn hơn hoặc bằng 0")
    @Max(value = 10, message = "Điểm phải nhỏ hơn hoặc bằng 10")
    Double marks;
    @NotNull(message = "Chọn giới tính")
    Boolean gender;
    @NotBlank(message = "Chọn quê quán")
    String country;
}
