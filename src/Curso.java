public class Curso {
    private String nomeCurso;
    private Professor professorCurso;

    public Curso(String nomeCurso, Professor professorCurso) {
        this.nomeCurso = nomeCurso;
        this.professorCurso = professorCurso;
    }

    @Override
    public String toString() {
        return "Nome do Curso: " + nomeCurso + "\nProfessor do Curso: " + professorCurso;
    }

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Professor getProfessorCurso() {
        return professorCurso;
    }

    public void setProfessorCurso(Professor professorCurso) {
        this.professorCurso = professorCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
}
