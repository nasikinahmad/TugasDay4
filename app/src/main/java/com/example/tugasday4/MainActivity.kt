package com.example.tugasday4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas_day_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setUserList()
    }

    private fun setUserList() {
        val listNames = listOf(
            "Kurniawan Dwi Retno",
            "Rini Purbasari",
            "Ahmad Arifin",
            "Siti Aisyah",
            "Adella Oktivia",
            "Dwi Cahyani Putri",
            "Hendra Wijaya",
            "Linda Triasri",
            "Farid Fadillah",
            "Eka Kurniawan"
        )

        val listEmails = listOf(
            "Kurniawan@gmail.com",
            "RiniPurbasari@gmail.com",
            "AhmadArifin@gmail.com",
            "SitiAisyah@gmail.com",
            "AdellaOktav@gmail.com",
            "DwiCahyani@gmail.com",
            "HendraWijaya@gmail.com",
            "Lindatri@gmail.com",
            "Faridfadillah@gmail.com",
            "Ekakurnia@gmail.com"
        )

        val listJurusan = listOf(
            "Teknik Informatika",
            "Akuntansi",
            "Psikologi",
            "Ilmu Komunikasi",
            "Manajemen",
            "Hukum",
            "Ekonomi",
            "Kedokteran",
            "Arsitektur",
            "Desain Grafis"
        )

        val listSemester = listOf(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        )

        val listImages = listOf(
            "https://st2.depositphotos.com/4431055/11856/i/950/depositphotos_118566586-stock-photo-student-man-with-laptop.jpg",
            "https://st3.depositphotos.com/1017228/31914/i/1600/depositphotos_319140920-stock-photo-image-of-positive-african-american.jpg",
            "https://st3.depositphotos.com/2783505/36722/i/1600/depositphotos_367229578-stock-photo-afro-american-male-student-backpack.jpg",
            "https://st4.depositphotos.com/4678277/28914/i/1600/depositphotos_289144242-stock-photo-portrairt-of-cute-nice-pretty.jpg",
            "https://st5.depositphotos.com/47153598/64415/i/1600/depositphotos_644152032-stock-photo-back-school-schoolgirl-student-headphones.jpg",
            "https://st4.depositphotos.com/4678277/20998/i/1600/depositphotos_209986390-stock-photo-ready-to-school-portrait-of.jpg",
            "https://st3.depositphotos.com/2783505/32530/i/1600/depositphotos_325300462-stock-photo-mexican-male-student-with-braces.jpg",
            "https://st.depositphotos.com/4678277/59240/i/1600/depositphotos_592409196-stock-photo-photo-pretty-sweet-girl-dressed.jpg",
            "https://st.depositphotos.com/1003098/3613/i/950/depositphotos_36130903-stock-photo-student-with-backpack-and-books.jpg",
            "https://st3.depositphotos.com/10654668/14858/i/1600/depositphotos_148586999-stock-photo-student-holding-books.jpg"
        )

        val rvUserListAdapter = UserListAdapter()

        binding.rvUserList.layoutManager = LinearLayoutManager(this)
        binding.rvUserList.adapter = rvUserListAdapter

        rvUserListAdapter.addListOfName(listNames)
        rvUserListAdapter.addListOfEmail(listEmails)
        rvUserListAdapter.addListOfJurusan(listJurusan)
        rvUserListAdapter.addListOfSemester(listSemester)
        rvUserListAdapter.addListOfImage(listImages)
    }
}