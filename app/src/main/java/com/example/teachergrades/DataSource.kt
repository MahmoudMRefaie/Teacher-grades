package com.example.teachergrades

import com.example.teachergrades.model.StudentInfo

class DataSource {
    companion object{
        fun classADataSet():ArrayList<StudentInfo>{
            val list = ArrayList<StudentInfo>()
            list.add(
                StudentInfo(
                    "Ali",
                    30
                )
            )
            list.add(
                StudentInfo(
                    "Ahmed",
                    27
                )
            )
            list.add(
                StudentInfo(
                    "Mohamed",
                    44
                )
            )
            list.add(
                StudentInfo(
                    "Mostafa",
                    38
                )
            )
            list.add(
                StudentInfo(
                    "Omar",
                    40
                )
            )
            return list
        }
        fun classBDataSet():ArrayList<StudentInfo>{
            val list = ArrayList<StudentInfo>()
            list.add(
                StudentInfo(
                    "Mahmoud",
                    40
                )
            )
            list.add(
                StudentInfo(
                    "Hossam",
                    33
                )
            )
            list.add(
                StudentInfo(
                    "Akram",
                    44
                )
            )
            list.add(
                StudentInfo(
                    "Eslam",
                    27
                )
            )
            list.add(
                StudentInfo(
                    "Amr",
                    31
                )
            )
            return list
        }
        fun classCDataSet():ArrayList<StudentInfo>{
            val list = ArrayList<StudentInfo>()
            list.add(
                StudentInfo(
                    "Momen",
                    35
                )
            )
            list.add(
                StudentInfo(
                    "Yousef",
                    41
                )
            )
            list.add(
                StudentInfo(
                    "Waled",
                    25
                )
            )
            list.add(
                StudentInfo(
                    "Ebrahim",
                    33
                )
            )
            list.add(
                StudentInfo(
                    "Khaled",
                    38
                )
            )
            return list
        }
    }
}