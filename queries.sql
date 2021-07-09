## Part 1: Test it with SQL
SELECT * FROM techjobs.job;
columns: id, employer, name, skills
data types: int, string, string, string

## Part 2: Test it with SQL
SELECT * FROM employer where location = "St. Louis City";

## Part 3: Test it with SQL
Drop Table job;

## Part 4: Test it with SQL
select * from skill
left join job_skills
on skill.id = job_skills.skills_id
where job_skills.jobs_id is not null
order by name asc