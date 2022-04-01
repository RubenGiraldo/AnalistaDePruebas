# Autor: Ruben Dario Giraldo Murcia

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than ruben wants to learn automation at the academy Choucair
    | strUser   | strPassword      |
    | <strUser> | <strPassword>    |
    When he search for the course on the choucair academy platform
    | strCourse   |
    | <strCourse> |
    Then he finds the course called
      | strCourse   |
      | <strCourse> |

    Examples:
    | strUser | strPassword   | strCourse               |
    | rpenna  | Febrero.2020  | Metodología Bamcolombia |
