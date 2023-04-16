package com.xworkz.mla.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.mla.dto.MlaDTO;

public class MlaRunner {

	public static void main(String[] args) {

		MlaDTO mlaDTOs = new MlaDTO("Shashikala Annasaheb Jolle", 54, "Nippani", "BJP", false, "Female");
		MlaDTO mlaDTOs1 = new MlaDTO("Ganesh Hukkeri", 45, "Chikkodi-Sadalga", "Congress", false, "Male");
		MlaDTO mlaDTOs2 = new MlaDTO("Mahesh Kumathalli", 61, "Athani", "BJP", false, "Male");
		MlaDTO mlaDTOs3 = new MlaDTO("Srimanth Patil", 68, "Kagwad", "BJP", false, "Male");
		MlaDTO mlaDTOs4 = new MlaDTO("P Rajeev", 45, "Kudachi", "BJP", false, "Male");
		MlaDTO mlaDTOs5 = new MlaDTO("Duryodhan Mahalingappa Aihole", 66, "Raibag", "BJP", false, "Male");
		MlaDTO mlaDTOs6 = new MlaDTO("Umesh Katti", 61, "Hukkeri", "BJP", false, "Male");
		MlaDTO mlaDTOs7 = new MlaDTO("Balachandra Jarkiholi", 56, "Arabavi", "BJP", false, "Male");
		MlaDTO mlaDTOs8 = new MlaDTO("Ramesh Jarkiholi", 62, "Gokak", "BJP", false, "Male");
		MlaDTO mlaDTOs9 = new MlaDTO("Satish Jarkiholi", 60, "Yemkanmardi", "Congress", false, "Male");
		MlaDTO mlaDTOs10 = new MlaDTO("Anil S Benake", 51, "Belgavi uttar", "BJP", false, "Male");
		MlaDTO mlaDTOs11 = new MlaDTO("Abhay Patil", 54, "Belgavi Dakshin", "BJP", false, "Male");
		MlaDTO mlaDTOs12 = new MlaDTO("Lakshmi Hebbalkar", 47, "Belgavi Rural", "Congress", false, "Female");
		MlaDTO mlaDTOs13 = new MlaDTO("Anjali Nimbalkar", 49, "Khanapur", "Congress", false, "Female");
		MlaDTO mlaDTOs14 = new MlaDTO("D. M. Basavantaray", 65, "Kittur", "BJP", false, "Male");
		MlaDTO mlaDTOs15 = new MlaDTO("Mahantesh Kaujlagi", 65, "Bailhongal", "Congress", false, "Male");
		MlaDTO mlaDTOs16 = new MlaDTO("Saundatti Yellamma", 0, null, null, false, null);
		MlaDTO mlaDTOs17 = new MlaDTO("Mahadevappa Shivalingappa Yadawad", 55, "Ramdurg", "BJP", false, "Male");
		MlaDTO mlaDTOs18 = new MlaDTO("Govind M. Karjol", 72, "Mudhol", "BJP", false, "Male");
		MlaDTO mlaDTOs19 = new MlaDTO("Siddu Savadi", 60, "Terdal", "BJP", false, "Male");
		MlaDTO mlaDTOs20 = new MlaDTO("Anand Nyamagouda", 63, "Jamkandhi", "Congress", false, "Male");
		MlaDTO mlaDTOs21 = new MlaDTO("Murugesh Nirani", 57, "Bilgi", "BJP", false, "Male");
		MlaDTO mlaDTOs22 = new MlaDTO("Siddaramaiah", 72, "Badami", "Congress", false, "Male");
		MlaDTO mlaDTOs23 = new MlaDTO("Veerabhadrayya Charantimath", 65, "Bagalakot", "BJP", false, "Male");
		MlaDTO mlaDTOs24 = new MlaDTO("Doddanagowda Patil", 54, "Hungund", "BJP", false, "Male");
		MlaDTO mlaDTOs25 = new MlaDTO("A. S. Patil (Nadahalli)", 56, "Mudebihal", "BJP", false, "Male");
		MlaDTO mlaDTOs26 = new MlaDTO("Somanagouda Patil", 59, "Devar Hipparagi", "BJP", false, "Male");
		MlaDTO mlaDTOs27 = new MlaDTO("Shivanand S Patil", 65, "Basavana Bagevadi", "Congress", false, "Male");
		MlaDTO mlaDTOs28 = new MlaDTO("M B Patil", 58, "Babaleshwar", "Congress", false, "Male");
		MlaDTO mlaDTOs29 = new MlaDTO("Basangouda Patil Yatnal", 59, "Bijapur City", "BJP", false, "Male");
		MlaDTO mlaDTOs30 = new MlaDTO("Devanand Fulasing Chavan", 60, "Nagathan", "Janata Dal(Secular)", false, "Male");
		MlaDTO mlaDTOs31 = new MlaDTO("Y V Patil", 59, "Indli", "Congress", false, "Male");
		MlaDTO mlaDTOs32 = new MlaDTO("Bhusanur Ramesh Balappa", 60, "Sindagi", "BJP", false, "Male");
		MlaDTO mlaDTOs34 = new MlaDTO("M. Y. Patil", 81, "Afzalpur ", "Congress", false, "Male");
		MlaDTO mlaDTOs35 = new MlaDTO("Ajay Dharam Singh", 60, "Jevaragi", "Congress", false, "Male");
		MlaDTO mlaDTOs36 = new MlaDTO("Narasimhanayak (Rajugouda)", 60, "Shorapur", "BJP", false, "Male");
		MlaDTO mlaDTOs37 = new MlaDTO("Sharanabasappa Gouda Darshanapur", 67, "Shahapur", "Congress", false, "Male");
		MlaDTO mlaDTOs38 = new MlaDTO("Venkatreddy Mudnal", 69, "Yadgiri", "BJP", false, "Male");
		MlaDTO mlaDTOs39 = new MlaDTO("Nagangouda Kandkur", 65, "Gurmitkal", "Janata Dal(Secular)", false, "Male");
		MlaDTO mlaDTOs40 = new MlaDTO("Priyank Kharge", 44, "Chittapur", "Congress", false, "Male");
		MlaDTO mlaDTOs41 = new MlaDTO("Rajkumar Patil", 45, "Sedam", "BJP", false, "Male");
		MlaDTO mlaDTOs42 = new MlaDTO("Avinash Jadhav", 61, "Chincholi", "BJP", false, "Male");
		MlaDTO mlaDTOs43 = new MlaDTO("Basawaraj Mattimud", 43, "Gulbarga Rural", "BJP", false, "Male");
		MlaDTO mlaDTOs44 = new MlaDTO("Dattatraya C. Patil Revoor", 40, "Gulbarga Dakshin", "BJP", false, "Male");
		MlaDTO mlaDTOs45 = new MlaDTO("Kaneez Fatima", 45, "Gulbarga Uttar", "Congress", false, "Female");
		MlaDTO mlaDTOs46 = new MlaDTO("Guttedar Subhash Rukmayya", 49, "Aland", "BJP", false, "Male");
		MlaDTO mlaDTOs47 = new MlaDTO("Sharanu Salagar", 47, "Basavakaylana", "BJP", false, "Male");
		MlaDTO mlaDTOs48 = new MlaDTO("Rajshekar Basavaraj Patil", 55, "Homnabad", "Congress", false, "Male");
		MlaDTO mlaDTOs49 = new MlaDTO("Bandeppa Kashempura", 58, "Bidar South", "Janata Dal(Secular)", false, "Male");
 		MlaDTO mlaDTOs50 = new MlaDTO("Rahim Khan", 56, "Bidar", "Congress", false, "Male");
		MlaDTO mlaDTOs51 = new MlaDTO("Eshwara Bhimanna Jhandre", 61, "Bhalki", "Congress", false, "Male");
		MlaDTO mlaDTOs52 = new MlaDTO("Prabhu Chavhan", 53, "Aurad", "BJP", false, "Male");
		MlaDTO mlaDTOs53 = new MlaDTO("Basanagouda Daddal", 60, "Raichur Rural", "Congress", false, "Male");
		MlaDTO mlaDTOs54 = new MlaDTO("DR. Sgivaraj Patil S", 60, "Raichuir", "BJP", false, "Male");
		MlaDTO mlaDTOs55 = new MlaDTO("Raja Venkatappa Naik", 65, "Manvi", "Janata Dal(Secular)", false, "Male");
		MlaDTO mlaDTOs56 = new MlaDTO("ShivanaGouda Naik", 60, "Devadurga", "BJP", false, "Male");
		MlaDTO mlaDTOs57 = new MlaDTO("D S Hoolageri", 59, "Lingsugur", "Congress", false, "Male");
		MlaDTO mlaDTOs58 = new MlaDTO("Venkatrao", 59, "Sindhanur", "Janata Dal (secular)", false, "Male");
		MlaDTO mlaDTOs59 = new MlaDTO("Basanagouda Turvihal", 65, "Maski", "Congress", false, "Male");
		MlaDTO mlaDTOs60 = new MlaDTO("Amaregouda Linganagouda Patil", 64, "Kushtagi", "Congress", false, "Male");
		MlaDTO mlaDTOs61 = new MlaDTO("Basavaraj Dhadesugur", 55, "Kanakagiri", "BJP", false, "Male");
		MlaDTO mlaDTOs62 = new MlaDTO("Paranna MUnavalli", 59, "Gangawati", "BJP", false, "Male");
		MlaDTO mlaDTOs63 = new MlaDTO("Achar Halappa Basappa", 60, "yelburga", "BJP", false, "Male");
		MlaDTO mlaDTOs64 = new MlaDTO("K. Raghavendra Basavaraj Hitnal", 67, "Koppal", "Congress", false, "Male");
		MlaDTO mlaDTOs65 = new MlaDTO("Ramappa Lamani", 60, "Shirahatti", "BJP", false, "Male");
		MlaDTO mlaDTOs66 = new MlaDTO("H.K Patil", 69, "Gadag", "Congress", false, "Male");
		MlaDTO mlaDTOs67 = new MlaDTO("Kalakappa Bnadi", 58, "Ron", "BJP", false, "Male");
		MlaDTO mlaDTOs68 = new MlaDTO("C C Patil", 64, "Nargiund", "BJP", false, "Male");
		MlaDTO mlaDTOs69 = new MlaDTO("Patil Munenakoppa Shankar", 55, "Navalgund", "BJP", false, "Male");
		MlaDTO mlaDTOs70 = new MlaDTO("Kusuma Shivalli", 51, "Kundgol", "Congress", false, "Female");
		MlaDTO mlaDTOs71 = new MlaDTO("Amrupayyappa Desai", 59, "Dharwad", "BJP", false, "");
		MlaDTO mlaDTOs72 = new MlaDTO("Abbayya Prasad", 54, "Hubli Darwadh east", "Congress", false, "Male");
		MlaDTO mlaDTOs73 = new MlaDTO("Jagadish Shettar", 67, "Hubli Dharwadh Central", "BJP", false, "Male");
		MlaDTO mlaDTOs74 = new MlaDTO("Aravind bellad", 53, "Hubli darwadh west", "BJP", false, "Male");
		MlaDTO mlaDTOs75 = new MlaDTO("C M Nimbannavar", 56, "Kalghatgi", "BJP", false, "Male");
		MlaDTO mlaDTOs76 = new MlaDTO("R V Deshpande", 76, "Haliyal", "Congress", false, "Male");
		MlaDTO mlaDTOs77 = new MlaDTO("Roopali Naik", 45, "Karwar", "BJP", false, "Female");
		MlaDTO mlaDTOs78 = new MlaDTO("Dinakar Keshav Shetty", 55, "Kumta", "BJP", false, "Male");
		MlaDTO mlaDTOs79 = new MlaDTO("Sunil Biliya Naik", 59, "Bhatkal", "BJP", false, "Male");
		MlaDTO mlaDTOs80 = new MlaDTO("Vishweshwar Hegde Kageri", 61, "Sirsi", "BJP", false, "Male");
		MlaDTO mlaDTOs81 = new MlaDTO("Arbali Shivaram Hebbar", 66, "Yellapur", "BJP", false, "Male");
		MlaDTO mlaDTOs82 = new MlaDTO("Srinivas mane", 54, "Hangal", "Congress", false, "Male");
		MlaDTO mlaDTOs83 = new MlaDTO("Basavaraj Bommai", 63, "Shiggaon", "BJP", false, "Male");
		MlaDTO mlaDTOs84 = new MlaDTO("Neharu Olekar", 55, "Haveri(SC)", "BJP", false, "Male");
		MlaDTO mlaDTOs85 = new MlaDTO("Ballary Virupakshappa Rudrappa", 59, "Byadagi", "BJP", false, "Male");
		MlaDTO mlaDTOs86 = new MlaDTO("B C Patil", 66, "Hirekerur", "BJP", false, "Male");
		MlaDTO mlaDTOs87 = new MlaDTO("Arunkumar Guthur", 55, "Ranebennur", "BJP", false, "Male");
		MlaDTO mlaDTOs88 = new MlaDTO("P T Parameshwar Naik", 57, "Hadagalli", "Congress", false, "Male");
		MlaDTO mlaDTOs89 = new MlaDTO("L.B.P Bheemanaik", 66, "Hagaribommanahalli", "Congress", false, "Male");
		MlaDTO mlaDTOs90 = new MlaDTO("Anandh singh", 56, "Vijanagara", "BJP", false, "Male");
		MlaDTO mlaDTOs91 = new MlaDTO("J.N Ganesh", 56, "Kampli", "Congress", false, "Male");
		MlaDTO mlaDTOs92 = new MlaDTO("M.S Somalingappa", 60, "Siruguppa", "BJP", false, "Male");
		MlaDTO mlaDTOs93 = new MlaDTO("B.Nagendra", 51, "Bellary Rural", "Congress", false, "Male");
		MlaDTO mlaDTOs94 = new MlaDTO("G.Somashekara Reddy", 57, "Bellary City", "BJP", false, "Male");
		MlaDTO mlaDTOs95 = new MlaDTO("E Tukaram", 55, "Sandur", "Congress", false, "Male");
		MlaDTO mlaDTOs96 = new MlaDTO(null, 0, "Kudligi", null, false, null);
		MlaDTO mlaDTOs97 = new MlaDTO("B. Sreeramulu", 51, "Molakalmuru", "BJP", false, "Male");
		MlaDTO mlaDTOs98 = new MlaDTO("T.Raghumurthy", 55, "Challakere", "Congress", false, "Male");
		MlaDTO mlaDTOs99 = new MlaDTO("G.H Thippareddy", 69, "Chitradurga", "BJP", false, "Male");
		MlaDTO mlaDTOs100 = new MlaDTO("Poornima Krishnappa", 46, "Hiriyur", "BJP", false, "Female");

//		Collection<String> details=new ArrayList<>();
//		
//	details.add(null)
//				

	}
}
