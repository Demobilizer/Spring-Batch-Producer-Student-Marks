Spring Batch Producer App:

	This app is providing Students data with following things.

	there are only two Controller calls:

		1) GET: to get all the students

			http://localhost:8081/get-students

		2) POST: to add the student with following details in Raw.

			http://localhost:8081/get-students

				{
					"studentName" : "s30",
					"marks1" : 74,
					"marks2" : 87,
					"marks3" : 41
				}