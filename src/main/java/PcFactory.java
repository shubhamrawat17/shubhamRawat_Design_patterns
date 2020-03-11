class PcFactory implements ComputerAbstractFactory
{
    String name;
    PcFactory(String n)
    {
        name=n;
    }

    @Override
    public Computer createComputer() {
        return new Pc(name) {
            @Override
            public String getRam() {
                return null;
            }
        };
    }
}
