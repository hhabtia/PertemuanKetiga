# Pertemuan Ketiga
Membahas tentang Abstract Class, Override, dan Overload.

## Daftar Isi
- [Abstract Class](#abstract-class)
- [Override](#override)
- [Overload](#overload)

---

## Abstract Class
**Abstract class** atau kelas abstrak adalah kelas yang terletak di posisi tertinggi dalam hierarki kelas. Kelas ini tidak dapat diinstansiasi karena masih bersifat abstrak. Kelas ini hanya berisi variabel umum dan deklarasi metode tanpa detail penggunaannya (metode abstrak).

---

## Override
**Override** adalah proses pembuatan ulang metode yang ada pada superclass di subclass atau anak kelas. Tujuannya adalah untuk memberikan perilaku yang spesifik sesuai kebutuhan kelas turunan.

### Kapan Metode ini Digunakan?
- Ketika kita ingin memberikan perilaku yang berbeda. Misalnya, kelas `Hewan` memiliki metode `bersuara()`, tetapi kelas `Anjing` dan `Kucing` memiliki suara yang berbeda.

---

## Overload
**Overload** adalah konsep dalam pemrograman di mana kita dapat memiliki beberapa metode dengan nama yang sama di dalam satu kelas, tetapi dengan parameter yang berbeda.

### Kapan Metode ini Digunakan?
- Ketika kita ingin memiliki beberapa metode dengan nama yang sama dalam satu kelas, tetapi dengan parameter yang berbeda.
