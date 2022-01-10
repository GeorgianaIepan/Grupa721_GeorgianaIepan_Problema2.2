package controller;

import model.Office;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OfficeController implements ICrudRepo {
    private List<Office> officeList;

    public OfficeController(List<Office> officeList) {
        this.officeList = new ArrayList<>();
    }

    @Override
    public Office findOne(int id) {
        for (Office office : officeList) {
            if (Objects.equals(office.getOfficeId(), id))
                return office;
        }
        return null;
    }

    @Override
    public List<Office> findAll() {
        return officeList;
    }

    @Override
    public void create(Object entity) {
        Office office = new Office();
        officeList.add(office);
    }

    @Override
    public void update(int id) {
        for (Office office : officeList) {
            if (Objects.equals(office.getOfficeId(), id)) {
                office.setOrt(office.getOrt());
            }
        }
    }

    @Override
    public void delete(int id) {
        officeList.removeIf(office -> Objects.equals(office.getOfficeId(), id));
    }
}