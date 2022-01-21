# World-Bank-Indicator-spark

Introduction
World Bank has released its data dump regarding population, health, internet, GDP, etc. We need to analyze the
data and solve the below mentioned problems.

Format of Data
•	Country Name
•	Date
•	"Transit: Railways, (million passenger-km)"
•	"Transit: Passenger cars (per 1,000 people)"
•	Business: Mobile phone subscribers
•	Business: Internet users (per 100 people)
•	"Health: Mortality
•	under-5 (per 1,000 live births)"
•	Health: Health expenditure per capita (current US$)
•	"Health: Health expenditure, total (% GDP)"
•	Population: Total (count)
•	Population: Urban (count)
•	"Population:: Birth rate, crude (per 1,000)"
•	"Health: Life expectancy at birth, female (years)"
•	"Health: Life expectancy at birth, male (years)"
•	"Health: Life expectancy at birth, total (years)"
•	Population: Ages 0-14 (% of total)
•	Population: Ages 15-64 (% of total)
•	Population: Ages 65+ (% of total)
•	Finance: GDP (current US$)
•	Finance: GDP per capita (current US$)

Sample Data
Afghanistan,7/1/2000,0,,0,,151,11,8,"25,950,816","5,527,524",51,45,45,45,48,50,2,,
Afghanistan,7/1/2001,0,,0,0,150,11,9,"26,697,430","5,771,984",50,46,45,46,48,50,2,"2,461,666,315",92
Afghanistan,7/1/2002,0,,"25,000",0,150,22,7,"27,465,525","6,025,936",49,46,46,46,48,50,2,"4,338,907,579",158
Afghanistan,7/1/2003,0,,"200,000",0,151,25,8,"28,255,719","6,289,723",48,46,46,46,48,50,2,"4,766,127,272",169
Afghanistan,7/1/2004,0,,"600,000",0,150,30,9,"29,068,646","6,563,700",47,46,46,46,48,50,2,"5,704,202,651",196
Afghanistan,7/1/2005,0,,"1,200,000",1,151,33,9,"29,904,962","6,848,236",47,47,47,47,48,50,2,"6,814,753,581",228
Afghanistan,7/1/2006,0,11,"2,520,366",2,151,24,7,"30,751,661","7,158,987",46,47,47,47,48,50,2,"7,721,931,671",251
Afghanistan,7/1/2007,0,18,"4,668,096",2,150,29,7,"31,622,333","7,481,844",45,47,47,47,47,50,2,"9,707,373,721",307
Afghanistan,7/1/2008,0,19,"7,898,909",2,150,32,7,"32,517,656","7,817,245",45,48,47,48,47,51,2,"11,940,296,131",367
Afghanistan,7/1/2009,0,21,"12,000,000",3,149,34,8,"33,438,329","8,165,640",44,48,48,48,47,51,2,"14,213,670,485",425
Afghanistan,7/1/2010,0,,"13,000,000",4,149,38,8,"34,385,068","8,527,497",44,48,48,48,46,51,2,"17,243,112,604",501

Problem statements
1. Highest urban population - Country having the highest urban population
2. Most populous Countries - List of countries in the descending order of their population
3. Highest population growth - Country with highest % population growth in past decade
4. Highest GDP growth - List of Countries with highest GDP growth from 2009 to 2010 in descending order
5. Internet usage grown - Country where Internet usage has grown the most in the past decade
6. Youngest Country - Yearly distribution of youngest Country
