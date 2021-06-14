import React, { useState, useEffect } from "react";
import { Table } from "semantic-ui-react";
import JobAdvertismentService from "../services/JobAdvertismentService";

export default function JobAdvertisements() {
  const [jobAdvertisements, setjobAdvertisements] = useState([]);

  useEffect(() => {
    let jobAdvertisementService = new JobAdvertismentService();
    jobAdvertisementService
      .getJobAdvertisement()
      .then((response) => setjobAdvertisements(response.data.data));
  }, []);

  return (
    <div>
      <Table celled fixed >
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Şirket Adı</Table.HeaderCell>
            <Table.HeaderCell>Şehir</Table.HeaderCell>
            <Table.HeaderCell>Açık Pozisyon</Table.HeaderCell>
            <Table.HeaderCell>Pozisyon Adı</Table.HeaderCell>
            <Table.HeaderCell>Min Maaş</Table.HeaderCell>
            <Table.HeaderCell>Max Maaş</Table.HeaderCell>
            <Table.HeaderCell>Son Başvuru Tarihi</Table.HeaderCell>
            <Table.HeaderCell>Şirket Maili</Table.HeaderCell>
            <Table.HeaderCell>Açıklama</Table.HeaderCell>
          </Table.Row>
        </Table.Header>

        <Table.Body>
          {jobAdvertisements.map((jobAdvertisement) => (
            <Table.Row key={jobAdvertisement.id}>
              <Table.Cell>{jobAdvertisement.employer.companyName}</Table.Cell>
              <Table.Cell>{jobAdvertisement.city.name}</Table.Cell>
              <Table.Cell>{jobAdvertisement.numberOfPerson}</Table.Cell>
              <Table.Cell>{jobAdvertisement.jobPosition.name}</Table.Cell>
              <Table.Cell>{jobAdvertisement.min}</Table.Cell>
              <Table.Cell>{jobAdvertisement.max}</Table.Cell>
              <Table.Cell>{jobAdvertisement.endDate}</Table.Cell>
              <Table.Cell>{jobAdvertisement.employer.email}</Table.Cell>
              <Table.Cell>{jobAdvertisement.description}</Table.Cell>
            </Table.Row>
          ))}
        </Table.Body>
      </Table>
    </div>
  );
}
